package com.github.catvod.spider.merge.c;

import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.github.catvod.spider.merge.c.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC0265b implements ThreadFactory {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f759short = {2212, 2231, 2214, 2221, 2202, 2209, 2220, 2230, 2222, 2202, 2220, 2218, 2202, 2272, 2209};
    public final AtomicInteger a = new AtomicInteger(0);

    /* renamed from: ۤۨۧ۟, reason: not valid java name and contains not printable characters */
    public static short[] m7658() {
        if (C0044.m7508() < 0) {
            return f759short;
        }
        return null;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        C0025.m4816(thread, C0002.m1327(C0011.m2805(m7658(), 0, 15, 2245), new Object[]{C0011.m2808(C0041.m6829(C0055.m8765(this)))}));
        return thread;
    }
}