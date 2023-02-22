#include <cstring>
#include <jni.h>

#include "Core.h"

extern "C" {

JNIEXPORT jstring JNICALL Java_com_example_cpptest_Core_concatenateMyStringWithCppString(JNIEnv *env, jobject /* this */, jstring myString) {
    const char *utfString = env->GetStringUTFChars(myString, nullptr);
    const char *textFromCppCore = concatenateMyStringWithCppString(utfString);
    jstring javaString = env->NewStringUTF(textFromCppCore);
    return javaString;
}

}
