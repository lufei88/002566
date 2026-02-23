package com.github.catvod.spider.merge.i1;

import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import java.io.PrintStream;

/* loaded from: classes.dex */
public final class b extends Exception {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f826short = {1098, 1096, 1116, 1114, 1100, 1101, 1033, 1099, 1104, 1043, 1033, 752, 747, 677, 686, 696, 703, 686, 687, 747, 686, 691, 680, 686, 699, 703, 674, 676, 677, 747, 674, 696, 753};
    public final Throwable a;

    public b(Exception exc) {
        StringBuffer stringBuffer = new StringBuffer();
        String strM1840 = C0007.m1840();
        C0051.m8251(stringBuffer, strM1840);
        C0051.m8251(stringBuffer, strM1840);
        StringBuffer stringBuffer2 = new StringBuffer(C0046.m7718(m8816(), 0, 11, 1065));
        C0039.m6541(stringBuffer2, exc);
        C0051.m8251(stringBuffer, C0058.m9069(stringBuffer2));
        super(C0058.m9069(stringBuffer));
        this.a = exc;
    }

    public b(String str) {
        super(str);
    }

    /* renamed from: ۟ۦ۟ۡ, reason: not valid java name and contains not printable characters */
    public static short[] m8816() {
        if (C0061.m9359() < 0) {
            return f826short;
        }
        return null;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        if (C0007.m1895(this) == null) {
            super.printStackTrace();
            return;
        }
        PrintStream printStreamM7298 = C0043.m7298();
        synchronized (printStreamM7298) {
            StringBuffer stringBuffer = new StringBuffer();
            C0051.m8251(stringBuffer, C0051.m8242(this));
            C0051.m8251(stringBuffer, C0023.m4536(m8816(), 11, 22, 715));
            C0012.m2969(printStreamM7298, C0058.m9069(stringBuffer));
            C0049.m7975(C0007.m1895(this));
        }
    }
}