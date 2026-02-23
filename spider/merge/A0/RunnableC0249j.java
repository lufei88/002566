package com.github.catvod.spider.merge.a0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0016;

/* renamed from: com.github.catvod.spider.merge.a0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0249j implements Runnable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f723short = {2415, 2341, 2342, 2350, 2329, 2344, 2350, 2348, 2420, 2365, 2363, 2344, 2346, 2348, 2304, 2349, 2412, 2426, 2312, 2361, 2346, 2326, 2341, 2342, 2350, 2336, 2343, 2367, 2428, 2326, 2424, 2430, 2429, 2427, 2416, 2430, 2425, 2427, 2425, 2428, 2412, 2427, 2314, 2341, 2342, 2350, 2329, 2344, 2350, 2348, 2412, 2426, 2312, 2341, 2342, 2350, 2336, 2343, 2367, 2428, 3017, 3026, 3030, 3032, 3027, 3092, 3080, 3080, 3084, 3087, 3142, 3155, 3155};
    public final /* synthetic */ int a;
    public final /* synthetic */ C0254o b;
    public final /* synthetic */ String c;

    public /* synthetic */ RunnableC0249j(C0254o c0254o, String str, int i) {
        this.a = i;
        this.b = c0254o;
        this.c = str;
    }

    /* renamed from: ۢۢۨۡ, reason: not valid java name and contains not printable characters */
    public static short[] m7001() {
        if (C0022.m4497() > 0) {
            return f723short;
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RunnableC0247h runnableC0247h;
        switch (C0016.m3539(this)) {
            case 0:
                String strM9108 = C0058.m9108(this);
                C0254o c0254oM7542 = C0045.m7542(this);
                C0047.m7777(c0254oM7542);
                try {
                    C0054.m8595(c0254oM7542, strM9108);
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                String strM91082 = C0058.m9108(this);
                C0254o c0254oM75422 = C0045.m7542(this);
                C0047.m7777(c0254oM75422);
                String strM9599 = C0064.m9599(m7001(), 0, 60, 2377);
                String strM5362 = C0030.m5362(m7001(), 60, 5, 3005);
                String strM1842 = C0007.m1842(m7001(), 65, 8, 3196);
                try {
                    try {
                        StringBuilder sb = new StringBuilder(strM1842);
                        C0018.m3933(sb, strM91082);
                        C0018.m3933(sb, strM9599);
                        C0014.m3369(c0254oM75422, C0047.m7763(sb));
                        runnableC0247h = new RunnableC0247h(c0254oM75422, C0020.m4251(strM5362, strM91082));
                    } catch (Throwable th) {
                        C0025.m4829(new RunnableC0247h(c0254oM75422, C0020.m4251(strM5362, strM91082)));
                        throw th;
                    }
                } catch (Exception unused2) {
                    StringBuilder sb2 = new StringBuilder(strM1842);
                    C0018.m3933(sb2, strM91082);
                    C0018.m3933(sb2, strM9599);
                    C0014.m3369(c0254oM75422, C0047.m7763(sb2));
                    runnableC0247h = new RunnableC0247h(c0254oM75422, C0020.m4251(strM5362, strM91082));
                }
                C0025.m4829(runnableC0247h);
                return;
        }
    }
}