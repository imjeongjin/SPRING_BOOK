package org.zerock.sample;


import org.springframework.stereotype.Component;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Component
@ToString
@Getter
//@AllArgsConstructor // 모든 필드값에 해당되는 모든 생성자를 무조건! 만들어줌
@RequiredArgsConstructor // 기본 생성자 만들어줌
public class SampleHotel {
	
//	@NonNull
	private Chef chef;
	private int age;
	 
//	public SampleHotel(Chef chef) {
//
//		this.chef = chef;
//	}
	
}
