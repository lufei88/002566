package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import java.io.PrintStream;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f768short = {18742, 21868, 26026, -28799, 22071, -27948, 2039, 2029};
    public Thread a;
    public boolean b = false;
    public final Object c = new Object();

    /* renamed from: ۟ۡ۠ۥۡ, reason: not valid java name and contains not printable characters */
    public static short[] m7881() {
        if (C0056.m8886() < 0) {
            return f768short;
        }
        return null;
    }

    public final void a() {
        if (C0051.m8260(this)) {
            this.b = false;
            synchronized (C0028.m5127(this)) {
                C0041.m6778(C0028.m5127(this));
            }
            try {
                C0030.m5426(C0058.m9157(this));
            } catch (InterruptedException unused) {
                C0034.m6006(C0031.m5631());
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (C0051.m8260(this)) {
            try {
                C0051.m8232();
            } catch (Exception unused) {
            }
            try {
                synchronized (C0028.m5127(this)) {
                    try {
                        if (C0051.m8260(this)) {
                            C0050.m8136(C0028.m5127(this), 3600000L);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (InterruptedException unused2) {
                if (C0051.m8260(this)) {
                    C0034.m6006(C0031.m5631());
                    C0051.m8215(this);
                }
            } catch (Exception e) {
                PrintStream printStreamM7298 = C0043.m7298();
                StringBuilder sb = new StringBuilder(C0020.m4199(m7881(), 0, 8, 1997));
                C0018.m3933(sb, C0036.m6261(e));
                C0012.m2969(printStreamM7298, C0047.m7763(sb));
                C0049.m7975(e);
            }
        }
    }
}