//
// Created by bdliang on 17-12-12.
//

#include "com_bdliang_mylib_MyLib.h"

/*
 * Class:     com_bdliang_mylib_MyLib
 * Method:    add
 * Signature: (II)I
 */
JNIEXPORT jint JNICALL Java_com_bdliang_mylib_MyLib_add
        (JNIEnv *, jobject, jint para1, jint para2) {
    return para1 + para2;
}
