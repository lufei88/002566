package com.github.catvod.spider.merge.g1;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import java.io.PrintStream;

/* loaded from: classes.dex */
public abstract class g {
    public static f a;
    public static boolean b;

    /* renamed from: short, reason: not valid java name */
    private static final short[] f801short = {2492, 2467, 2473, 2523, 2469, 2517, 2511};

    public static final void a(String str) {
        PrintStream printStreamM7298 = C0043.m7298();
        StringBuilder sb = new StringBuilder(C0045.m7657(m8532(), 0, 7, 2543));
        C0018.m3933(sb, str);
        C0012.m2969(printStreamM7298, C0047.m7763(sb));
    }

    /* renamed from: ۦۤۢۦ, reason: contains not printable characters */
    public static short[] m8532() {
        if (C0005.m1599() <= 0) {
            return f801short;
        }
        return null;
    }
}