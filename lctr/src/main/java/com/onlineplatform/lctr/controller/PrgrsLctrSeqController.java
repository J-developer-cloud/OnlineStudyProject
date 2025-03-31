package com.onlineplatform.lctr.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.onlineplatform.lctr.model.LctrSeqVO;
import com.onlineplatform.lctr.service.PrgrsLctrSeqService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class PrgrsLctrSeqController {

    @Autowired
    private PrgrsLctrSeqService prgrsLctrSeqService;
    
    // 예: 회원 이메일을 쿼리 파라미터로 받아 해당 회원의 강의 진도 데이터를 반환
    @GetMapping("/prgrsLctrSeq")
    public List<LctrSeqVO> getPrgrsLctrSeq(@RequestParam String emlAddr) {
        return prgrsLctrSeqService.getPrgrsLctrSeqList(emlAddr);
    }
}
