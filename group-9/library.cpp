#include <iostream>
#include"main.h"
#include"head.h"

int main() {
	while (1) {
		Menu();					  	 //�˵�
		char ch = getchar();
		switch (ch) {
			case'1':
				InputBookInfo();		 //���ͼ����Ϣ
				break;
			case'2':
				PrintBookInfo();		 //��ӡͼ����Ϣ
				break;
			case'3':
				RecommendBook();	     //�Ƽ�ͼ����Ϣ
				break;
			case'4':
				Locate_BookInfo_name();  //����������
				break;
			case'5':
				Locate_BookInfo_author();//�����߲���
				break;
			case'6':
				ChangeBookInfo();		 //�޸�ͼ����Ϣ
				break;
			case'7':
				DeletBookInfo();		 //ɾ��ͼ����Ϣ
				break;
			case'0':
				ExitBookInfo();         //�˳�ͼ����Ϣϵͳ
				break;
			default:
				system("pause");
				system("cls");
				break;
		}
	}
	return 0;
}
void Menu() {
	printf("\t*************************************************\n");
	printf("\t\t    ��ӭʹ�ô���С�˼�ͼ�����ϵͳ\n");
	printf("\t\t\t    ��ѡ����\n");
	printf("\t*************************************************\n");
	printf("\t\t\t  1.���ͼ����Ϣ\n");
	printf("\t\t\t  2.��ӡͼ����Ϣ\n");
	printf("\t\t\t  3.�Ƽ�ͼ����Ϣ\n");
	printf("\t\t\t  4.����������  \n");
	printf("\t\t\t  5.�����߲���  \n");
	printf("\t\t\t  6.�޸�ͼ����Ϣ\n");
	printf("\t\t\t  7.ɾ��ͼ����Ϣ\n");
	printf("\t\t\t  0.�˳�ͼ����Ϣϵͳ\n");
	printf("\t*************************************************\n");
}
void InputBookInfo() {   //���ͼ����Ϣ
	Node* pNewNode = (Node*)malloc(sizeof(Node));
	pNewNode->next = NULL;
	Node* p = head;
	while (head != NULL && p->next != NULL)
		p = p->next;
	if (head == NULL)
		head = pNewNode;
	else
		p->next = pNewNode;
	printf("������������");
	scanf("%s", pNewNode->info.name);
	printf("��������������");
	scanf("%s", pNewNode->info.author);
	printf("����������磺");
	scanf("%s", pNewNode->info.publisher);
	printf("������������ڣ�");
	scanf("%s", pNewNode->info.date);
	printf("������۸�");
	scanf("%s", pNewNode->info.price);
	char c;
	int num = 0;
	do {
		printf("¼��ɹ���");
		printf("�Ƿ����¼�루Y/N������");
		getchar();
		scanf("%c", &c);
		if (c == 'y' || c == 'Y')
			InputBookInfo();
		else {
			if (c == 'n' || c == 'N') {
				system("cls");
				return;
			} else
				printf("�����������������");
		}
	} while (c != 'y' && c != 'Y' && c != 'n' && c != 'N');
	system("pause");
	system("cls");
}
void PrintBookInfo() { //��ӡͼ����Ϣ
	Node* p = head;
	int count = 1;
	if (p == NULL)
		printf("ϵͳ������ͼ����Ϣ����ȷ�������Ƿ���ȷ");
	else {
		while (p != NULL) {
			printf("************��%d��ͼ��************", count);
			printf("\n");
			printf("\t������    %-20s\n", p->info.name);
			printf("\t��������  %-20s\n", p->info.author);
			printf("\t�����磺  %-20s\n", p->info.publisher);
			printf("\t�������ڣ�%-20s\n", p->info.date);
			printf("\t�۸�    %-20s\n", p->info.price);
			p = p->next;
			count++;
		}
		printf("������������ز˵�\n");
		getchar();
	}
	system("pause");
	system("cls");
}
void RecommendBook() { //�Ƽ�ͼ����Ϣ
	int a = rand() % 10;
	Node* p = head;
	bool flag = false;
	int i = 1;
	if (p == NULL)
		printf("ϵͳ������ͼ����Ϣ����ȷ�������Ƿ���ȷ");
	else {
		while (p != NULL) {
			if (a == i) {
				flag = true;
				printf("************��%d��ͼ��************", i);
				printf("\n");
				printf("\t������    %-20s\n", p->info.name);
				printf("\t��������  %-20s\n", p->info.author);
				printf("\t�����磺  %-20s\n", p->info.publisher);
				printf("\t�������ڣ�%-20s\n", p->info.date);
				printf("\t�۸�    %-20s\n", p->info.price);
				p = p->next;
				i++;
			} else {
				p = p->next;
				i++;
			}
		}
		if (!false) {
			printf("�����Ƽ�ͼ�飡");
		}
		printf("������������ز˵�\n");
		getchar();
	}
	system("pause");
	system("cls");
}
void Locate_BookInfo_name() { //����������
	int flag = 0;
	char name[20];
	Node* p = head;
	printf("����������Ҫ��ѯ��������");
	scanf("%s", name);
	printf("\n");
	printf("����ɹ���\n");
	printf("�����������ҵ���Ϣ��\n");
	while (p != NULL) {
		if (strcmp(p->info.name, name) == 0) {
			printf("����:    %-20s\n", p->info.name);
			printf("������:  %-20s\n", p->info.author);
			printf("������:  %-20s\n", p->info.publisher);
			printf("��������:%-20s\n", p->info.date);
			printf("�۸�:    %-20s\n", p->info.price);
			printf("\n");
			flag = 1;
			p = p->next;
		} else {
			p = p->next;
		}
	}
	if (flag == 0) {
		printf("û�и���������Ϣ\n");
		printf("������������ز˵�\n");
		getchar();
	}
	system("pause");
	system("cls");
}
void Locate_BookInfo_author() { //�����߲���
	int flag = 0;
	char author[20];
	Node* p = head;
	printf("����������Ҫ��ѯ����������");
	scanf("%s", author);
	printf("\n");
	printf("����ɹ���\n");
	printf("�����������ҵ���Ϣ��\n");
	printf("\n");
	while (p != NULL) {
		if (strcmp(p->info.author, author) == 0) {
			printf("����:    %-20s\n", p->info.name);
			printf("������:  %-20s\n", p->info.author);
			printf("������:  %-20s\n", p->info.publisher);
			printf("��������:%-20s\n", p->info.date);
			printf("�۸�:    %-20s\n", p->info.price);
			printf("\n");
			flag = 1;
			p = p->next;
		} else {
			p = p->next;
		}
	}
	if (flag == 0) {
		printf("û�и����ߵ���Ϣ\n");
		printf("\n");
		printf("������������ز˵�\n");
		getchar();
	}
	system("pause");
	system("cls");
}
void ChangeBookInfo() { //�޸�ͼ����Ϣ
	char name[20];
	printf("��������Ҫ�޸ĵ�ͼ������\n");
	scanf("%s", name);
	Node* p = head;
	int flag = 0;
	while (p != NULL) {
		if (strcmp(p->info.name, name) == 0) {
			printf("����:    %-20s\n", p->info.name);
			printf("������:  %-20s\n", p->info.author);
			printf("������:  %-20s\n", p->info.publisher);
			printf("��������:%-20s\n", p->info.date);
			printf("�۸�:    %-20s\n", p->info.price);
			printf("\n");
			flag = 1;
			printf("������������");
			scanf("%s", p->info.name);
			printf("��������������");
			scanf("%s", p->info.author);
			printf("����������磺");
			scanf("%s", p->info.publisher);
			printf("������������ڣ�");
			scanf("%s", p->info.date);
			printf("������۸�");
			scanf("%s", p->info.price);
			printf("\n");

			p = p->next;
		}
		if (flag == 0) {
			printf("û�и���������Ϣ\n");
			printf("������������ز˵�\n");
			getchar();
		}
	}
	system("pause");
	system("cls");
}
void DeletBookInfo() {//ɾ��ͼ����Ϣ
	char name[20];
	printf("��������Ҫɾ����ͼ������\n");
	scanf("%s", name);
	printf("\n");
	Node* p = head;
	Node* q = head;
	Node* s = (Node*)malloc(sizeof(Node));
	int flag = 0;
	while (p != NULL) {
		if (strcmp(p->info.name, name) == 0) {
			printf("����:    %-20s\n", p->info.name);
			printf("������:  %-20s\n", p->info.author);
			printf("������:  %-20s\n", p->info.publisher);
			printf("��������:%-20s\n", p->info.date);
			printf("�۸�:    %-20s\n", p->info.price);
			printf("\n");
			flag = 1;

			if (p == head) {
				head = p->next;
			} else if (p->next == NULL) {
				p = q;
				p->next = NULL;
			} else {
				q->next = p->next;
			}

		}
		q = p;
		p = p->next;
	}
	if (flag == 0) {
		printf("û�и���������Ϣ\n");
		printf("\n");
		printf("������������ز˵�\n");
		printf("\n");
		getchar();
	}
	system("pause");
	system("cls");
}
void ExitBookInfo() { //�˳�ͼ�����ϵͳ
	printf("�����˳�����\n");
	printf("\n");
	exit(0);
}
