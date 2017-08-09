package com.TB.TBox.user.interfaceTo;

import java.util.List;
import java.util.Map;

public interface ToNodeInterface {
	public int selectFriendUid(String friendNumber);
	
	public List<Integer> selectAllFriendUid(Map<String,Object> map);
	
	public String selectUserNumber(int uid);
}
