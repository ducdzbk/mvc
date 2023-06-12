package com.fds.quanlilichlamviec.action.impl;

import com.fds.flex.common.ultility.RestfullUtil;
import com.fds.flex.common.ultility.Validator;
import com.fds.quanlilichlamviec.action.LichLamViecCaNhanAction;
import com.fds.quanlilichlamviec.constant.Constant;
import com.fds.quanlilichlamviec.constant.NotificationConstant;
import com.fds.quanlilichlamviec.dto.req.LichLamViecCaNhanReqDTO;
import com.fds.quanlilichlamviec.entity.T_Model.LichLamViecCaNhan;
import com.fds.quanlilichlamviec.exception.BadRequestException;
import com.fds.quanlilichlamviec.exception.NotfoundException;
import com.fds.quanlilichlamviec.service.LichLamViecCaNhanService;
import com.fds.quanlilichlamviec.util.MessageUtil;
import com.fds.quanlilichlamviec.util.QLLLVUtil;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class LichLamViecCaNhanActionImpl implements LichLamViecCaNhanAction {

    @Autowired
    private LichLamViecCaNhanService lichLamViecCaNhanService;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public LichLamViecCaNhan findLichLamViecCaNhan(String id) {
        if (Validator.isNull(id)) {
            throw new BadRequestException(RestfullUtil.RespCode.FIELD_NULL_OR_EMPRY_ERROR.getCode(),
                    NotificationConstant.LOAILICH_ID_NULL_EMPTY,
                    MessageUtil.responseMessage(NotificationConstant.LOAILICH_ID_NULL_EMPTY));
        }
        Optional<LichLamViecCaNhan> lichLamViecCaNhanOptional = lichLamViecCaNhanService.findById(id);
        if (!lichLamViecCaNhanOptional.isPresent()) {
            throw new NotfoundException(RestfullUtil.RespCode.NOT_FOUND_ENTRY_ERROR.getCode(),
                    NotificationConstant.LOAILICH_DOCUMENT_NOT_FOUND,
                    MessageUtil.responseMessage(NotificationConstant.LOAILICH_DOCUMENT_NOT_FOUND));
        }
        return lichLamViecCaNhanOptional.get();
    }

    @Override
    public LichLamViecCaNhan addLichLamViecCaNhan(LichLamViecCaNhanReqDTO lichLamViecCaNhanReqDTO) {
        LichLamViecCaNhan lichLamViecCaNhan = new LichLamViecCaNhan(false);

        modelMapper.map(lichLamViecCaNhanReqDTO, lichLamViecCaNhan);



        // TODO set NguoiTaoLap set NguoiCapNhat

        return lichLamViecCaNhanService.updateLichLamViecCaNhan(lichLamViecCaNhan, false);
    }

    @Override
    public LichLamViecCaNhan updateLichLamViecCaNhan(String id, LichLamViecCaNhanReqDTO lichLamViecCaNhanReqDTO) {

        if (Validator.isNull(id)) {
            throw new BadRequestException(RestfullUtil.RespCode.FIELD_NULL_OR_EMPRY_ERROR.getCode(),
                    "lichLamViecCaNhan.id_null_or_empty", RestfullUtil.RespCode.FIELD_NULL_OR_EMPRY_ERROR.getMsg());
        }

        Optional<LichLamViecCaNhan> lichLamViecCaNhanOpt = lichLamViecCaNhanService.findById(id);

        if (!lichLamViecCaNhanOpt.isPresent()) {
            throw new NotfoundException(RestfullUtil.RespCode.NOT_FOUND_ENTRY_ERROR.getCode(),
                    "lichLamViecCaNhan_notfound_entry", RestfullUtil.RespCode.NOT_FOUND_ENTRY_ERROR.getMsg());
        }

        LichLamViecCaNhan lichLamViecCaNhan = lichLamViecCaNhanOpt.get();

        modelMapper.map(lichLamViecCaNhanReqDTO, lichLamViecCaNhan);



        // TODO set NguoiTaoLap set NguoiCapNhat

        return lichLamViecCaNhanService.updateLichLamViecCaNhan(lichLamViecCaNhan, true);
    }


    @Override
    public void deleteLichLamViecCaNhan(String id) {
        if (Validator.isNull(id)) {
            throw new BadRequestException(RestfullUtil.RespCode.FIELD_NULL_OR_EMPRY_ERROR.getCode(),
                    "lichLamViecCaNhan.id_null_or_empty", RestfullUtil.RespCode.FIELD_NULL_OR_EMPRY_ERROR.getMsg());
        }

        Optional<LichLamViecCaNhan> lichLamViecCaNhanOpt = lichLamViecCaNhanService.findById(id);

        if (!lichLamViecCaNhanOpt.isPresent()) {
            throw new NotfoundException(RestfullUtil.RespCode.NOT_FOUND_ENTRY_ERROR.getCode(),
                    "lichLamViecCaNhan_notfound_entry", RestfullUtil.RespCode.NOT_FOUND_ENTRY_ERROR.getMsg());
        }

        lichLamViecCaNhanService.deleteLichLamViecCaNhan(lichLamViecCaNhanOpt.get());
    }


    @Override
    public Page<LichLamViecCaNhan> filter(String keyword, Integer page, Integer size, String orderFields, String orderTypes) {
        if (page == -1 && size == -1) {
            page = 0;
            size = lichLamViecCaNhanService.countAll().intValue() > Constant.DEFAULT_MAX_PAGE_SIZE ? lichLamViecCaNhanService.countAll().intValue() : Constant.DEFAULT_MAX_PAGE_SIZE;
        } else {
            if (page == null || page < 0) {
                page = 0;
            }

            if (size == null || size < 0) {
                size = Constant.DEFAULT_MIN_PAGE_SIZE;
            }


            if (size > Constant.DEFAULT_MAX_PAGE_SIZE) {
                size = Constant.DEFAULT_MAX_PAGE_SIZE;
            }
        }

        Sort sort = QLLLVUtil.sortBuilder(orderFields, orderTypes, LichLamViecCaNhan.class);

        Pageable pageable = PageRequest.of(page, size, sort);

        return lichLamViecCaNhanService.filter(keyword, pageable);
    }
}

