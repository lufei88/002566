package com.github.catvod.spider.merge.h0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.j.C0013;

/* renamed from: com.github.catvod.spider.merge.h0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0327g implements Runnable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f814short = {22470, -30181, 23639, -30653, 1372, 1350, 26402, -27509, 23995, -30289, 1200, 1194};
    public final /* synthetic */ int a;
    public final /* synthetic */ C0335o b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ RunnableC0327g(C0335o c0335o, Exception exc, int i) {
        this.a = i;
        this.b = c0335o;
        this.c = exc;
    }

    /* renamed from: ۣۦۦۡ, reason: not valid java name and contains not printable characters */
    public static short[] m8666() {
        if (C0035.m6140() <= 0) {
            return f814short;
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (C0040.m6662(this)) {
            case 0:
                C0335o c0335oM8471 = C0053.m8471(this);
                C0010.m2319(C0013.m3137(c0335oM8471), 8);
                C0010.m2319(C0009.m2040(c0335oM8471), 0);
                StringBuilder sb = new StringBuilder(C0047.m7833(m8666(), 6, 6, 1162));
                C0018.m3933(sb, C0036.m6261(C0056.m8927(this)));
                C0038.m6402(C0047.m7763(sb));
                break;
            default:
                C0335o c0335oM84712 = C0053.m8471(this);
                C0010.m2319(C0013.m3137(c0335oM84712), 8);
                StringBuilder sb2 = new StringBuilder(C0031.m5565(m8666(), 0, 6, 1382));
                C0018.m3933(sb2, C0036.m6261(C0056.m8927(this)));
                C0047.m7835(c0335oM84712, C0047.m7763(sb2));
                break;
        }
    }
}