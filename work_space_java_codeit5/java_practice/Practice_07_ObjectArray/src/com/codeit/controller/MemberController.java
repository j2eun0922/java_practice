package com.codeit.controller;

import java.util.Arrays;

import com.codeit.model.Member;

public class MemberController {
    public static int MAX_SIZE = 10;    // 배열의 최대 크기
    private Member[] mArray = new Member[MAX_SIZE]; // 배열

    public int existMemberNum() {
        int count = 0;
        for (int i = 0; i < MAX_SIZE; i++) {
            if (mArray[i] != null) {
                count++;
            }
        }
        return count;
    }

    public void updateArray(int idx){
        for (int i = idx; i<existMemberNum()+1; i++){
            mArray[i] = mArray[i+1];
        }
    }

    public boolean checkId(String inputId) {
        for (int i = 0; i < existMemberNum(); i++) {
            if (mArray[i].getId().equals(inputId)) {
                return true;
            }
        }
        return false;
    }

    public Member searchId(String id) {
        for (int i = 0; i < existMemberNum(); i++) {
            if (mArray[i].getId().equals(id)) {
                return mArray[i];
            }
        }
        return null;
    }

    public Member[] searchName(String name) {
        Member[] result = new Member[existMemberNum()];
        int j=0;
        for (int i = 0; i < existMemberNum(); i++) {
            if (mArray[i].getName().contains(name))
                result[j++] = mArray[i];
        }
        return result;
    }

    public Member[] searchEmail(String email) {
        Member[] result = new Member[existMemberNum()];
        int j=0;
        for (int i = 0; i < existMemberNum(); i++) {
            if (mArray[i].getEmail().contains(email))
                result[j++] = mArray[i];
        }
        return result;
    }


    public void insertMember(String id, String name, String password, String email, char gender, int age) {
        mArray[existMemberNum()] = new Member(id, name, password, email, gender, age);
    }

    public boolean updatePassword(String id, String password) {
        for (int i = 0; i < existMemberNum(); i++) {
            if (mArray[i].getId().equals(id)) {
                mArray[i].setPassword(password);
                return true;
            }
        }
        return false;
    }

    public boolean updateName(String id, String name) {
        for (int i = 0; i < existMemberNum(); i++) {
            if (mArray[i].getId().equals(id)) {
                mArray[i].setName(name);
                return true;
            }
        }
        return false;
    }

    public boolean updateEmail(String id, String email) {
        for (int i = 0; i < existMemberNum(); i++) {
            if (mArray[i].getId().equals(id)) {
                mArray[i].setEmail(email);
                return true;
            }
        }
        return false;
    }

    public boolean delete(String id) {
        for (int i = 0; i < existMemberNum(); i++) {
            if (mArray[i].getId().equals(id)) {
                mArray[i] = null;
                updateArray(i);
                return true;
            }
        }
        return false;
    }

    public void delete() {
        int count = existMemberNum();
        for (int i = 0; i < count; i++)
            mArray[i] = null;
    }

    public Member[] printAll() {
        return mArray;
    }
}




