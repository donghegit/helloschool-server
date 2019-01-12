package com.grapep.byle;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.grapep.byle.commodity.dao.CommodityMapper;
import com.grapep.byle.commodity.entity.Commodity;
import com.grapep.byle.commodity.entity.CommodityExample;
import com.grapep.byle.commodity.entity.CommodityWithBLOBs;
import com.grapep.byle.kind.dao.KindMapper;
import com.grapep.byle.kind.entity.Kind;
import com.grapep.byle.user.dao.UserMapper;
import com.grapep.byle.user.entity.User;
import com.grapep.byle.user.entity.UserExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ByleApplicationTests {

	@Autowired
	private KindMapper kindMapper;
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private CommodityMapper commodityMapper;

	@Autowired
	private StringRedisTemplate stringRedisTemplate;


	@Test
	public void contextLoads() {
	}

	@Test
	public void PageTest(){
//		PageHelper.startPage(1,5);
//		List<Kind> kinds = kindMapper.selectAllKind();
//		PageInfo pageInfo = new PageInfo(kinds);

//        String s = "1212.34";
//        Long l = Long.parseLong(s);
	}

	@Test
	public void UserTest(){
//		UserExample userExample = new UserExample();
//		UserExample.Criteria userCriteria = userExample.createCriteria();
//		userCriteria.andSchoolIdEqualTo(1);
//		List<User> users = userMapper.selectByExample(userExample);
//		Iterator<User> usersIterator = users.iterator();
//		List<Integer> userIds = new ArrayList<>();
//		while (usersIterator.hasNext()){
//			Integer userId = usersIterator.next().getUserId();
//			userIds.add(userId);
//		}
//
//
//		CommodityExample commodityExample = new CommodityExample();
//		CommodityExample.Criteria commodityExampleCriteria = commodityExample.createCriteria();
//		commodityExampleCriteria.andUserIdIn(userIds);
//		List<Commodity> commodities = commodityMapper.selectByExample(commodityExample);
	}

	@Test
	public void test() throws Exception {
//		List<String> list =new ArrayList<>();
//		list.add("a");
//		list.add("b");
//		list.add("v");
//		stringRedisTemplate.opsForValue().set("abc", "测试");
//		stringRedisTemplate.opsForList().leftPushAll("qq",list); // 向redis存入List
//		stringRedisTemplate.opsForList().range("qwe",0,-1).forEach(value ->{
//			System.out.println(value+"1111111111薛本刚");
//		});
	}

}
