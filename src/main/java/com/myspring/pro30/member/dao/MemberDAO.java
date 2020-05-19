package com.myspring.pro30.member.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.myspring.pro30.member.vo.MemberVO;

public interface MemberDAO {

	int insertMember(MemberVO memberVO) throws DataAccessException;

	List selectAllMemberList() throws DataAccessException;

	int deleteMember(String id) throws DataAccessException;

	public MemberVO loginById(MemberVO memberVO) throws DataAccessException;

}
