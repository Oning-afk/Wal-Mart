package com.walmart.service;

import com.walmart.entity.PageResult;
import com.walmart.pojo.Member;

public interface MemberService {
    PageResult findMember(int pageSize, int pageNum, Member member);
}
