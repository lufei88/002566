package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.x.C0016;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static /* synthetic */ AssertionError a(String str, AssertionError assertionError) {
        try {
            return (AssertionError) C0016.m3522(C0005.m1638(AssertionError.class, new Class[]{String.class, Throwable.class}), new Object[]{str, assertionError});
        } catch (Exception unused) {
            return new AssertionError(str);
        }
    }

    public static String b(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        C0036.m6177(sb, i);
        return C0047.m7763(sb);
    }

    public static String c(String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        C0018.m3933(sb, str2);
        return C0047.m7763(sb);
    }

    public static String d(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        C0018.m3933(sb, str2);
        C0018.m3933(sb, str3);
        return C0047.m7763(sb);
    }

    public static String e(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        C0018.m3933(sb, str2);
        C0018.m3933(sb, str3);
        C0018.m3933(sb, str4);
        C0018.m3933(sb, str5);
        return C0047.m7763(sb);
    }

    public static String f(StringBuilder sb, String str, String str2) {
        C0018.m3933(sb, str);
        C0018.m3933(sb, str2);
        return C0047.m7763(sb);
    }

    public static StringBuilder g(String str) {
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, str);
        return sb;
    }

    public static StringBuilder h(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        C0018.m3933(sb, str2);
        C0018.m3933(sb, str3);
        return sb;
    }

    public static /* synthetic */ void i(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }
}