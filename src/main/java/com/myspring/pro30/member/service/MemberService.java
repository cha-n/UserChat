package com.myspring.pro30.member.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.myspring.pro30.member.vo.MemberVO;
public interface MemberService {

	List<MemberVO> listMembers() throws DataAccessException;

	int addMember(MemberVO memberVO) throws DataAccessException;

	int removeMember(String id) throws DataAccessException;

	MemberVO login(MemberVO member) throws Exception;

}
