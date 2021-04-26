#pragma once

#include<stdio.h>
#include<stdlib.h>
#include<string.h>

	typedef struct bookInfo { //定义图书信息结构体变量
		char name[20];      //书名
		char author[20];    //作者名
		char publisher[20]; //出版社
		char date[20];      //出版日期
		char price[20];	    //价格
	} Information;

	typedef struct PNode {	//创建链表节点
		Information info;   //图书信息
		struct PNode* next; //下一个节点

	} Node;

	Node* head = NULL;
	//定义头指针

	

