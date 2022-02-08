package com.cg.smms.entities;

import java.util.List;

public class Mall {
private long id;
private MallAdmin mallAdmin;
private String mallName;
private String location;
private List<Shop> shops;
private enum categories{
	REGIONAL,SUPERREGIONAL
};

}
