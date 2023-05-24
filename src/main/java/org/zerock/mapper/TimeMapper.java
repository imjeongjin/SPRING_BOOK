package org.zerock.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
	
	//select sysdate from dual;
	@Select("select sysdate from dual")
	public String getTime();
	
	//XML 형식으로 처리할 getTime2() 메서드 선언
	public String getTime2();
}
