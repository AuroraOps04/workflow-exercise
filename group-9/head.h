#pragma once

#include<stdio.h>
#include<stdlib.h>
#include<string.h>

	typedef struct bookInfo { //����ͼ����Ϣ�ṹ�����
		char name[20];      //����
		char author[20];    //������
		char publisher[20]; //������
		char date[20];      //��������
		char price[20];	    //�۸�
	} Information;

	typedef struct PNode {	//��������ڵ�
		Information info;   //ͼ����Ϣ
		struct PNode* next; //��һ���ڵ�

	} Node;

	Node* head = NULL;
	//����ͷָ��

	

