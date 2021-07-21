package com.example.myproject.model.dao;

import java.util.List;

import com.example.myproject.model.dto.MemberDTO;


public interface MemberDAO {
	public List<MemberDTO> list();
	public void insert(MemberDTO dto);
	public MemberDTO detail(String userid);
	public void delete(String userid);
	public void update(MemberDTO dto);
	public boolean check_passwd(String userid, String passwd);
}
