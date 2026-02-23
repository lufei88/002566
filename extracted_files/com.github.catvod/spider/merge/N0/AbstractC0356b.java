package com.github.catvod.spider.merge.n0;

import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import java.io.PrintStream;

/* renamed from: com.github.catvod.spider.merge.n0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0356b {
    public static final boolean a;
    public static /* synthetic */ Class b;

    /* renamed from: short, reason: not valid java name */
    private static final short[] f840short = {523, 542, 543, 605, 512, 519, 513, 534, 530, 542, 605, 535, 534, 529, 518, 532, 2994, 2997, 2995, 2980, 2976, 2988, 3035, 3009, 3314, 3280, 3277, 3284, 3275, 3270, 3271, 3280, 3202, 1566, 1629, 1617, 1611, 1618, 1626, 1566, 1616, 1617, 1610, 1566, 1628, 1627, 1566, 1623, 1616, 1613, 1610, 1631, 1616, 1610, 1623, 1631, 1610, 1627, 1626, 1540, 1566, 2574, 2624, 2625, 2650, 2574, 2632, 2625, 2651, 2624, 2634};

    static {
        try {
            a = C0056.m8891(C0051.m8259(m8853(), 0, 16, 627)) != null;
        } catch (Exception unused) {
        }
    }

    public static void a(String str) {
        if (C0057.m8966()) {
            PrintStream printStreamM7298 = C0043.m7298();
            StringBuffer stringBuffer = new StringBuffer(C0043.m7290(m8853(), 16, 8, 3041));
            C0051.m8251(stringBuffer, str);
            C0012.m2969(printStreamM7298, C0058.m9069(stringBuffer));
        }
    }

    public static Object b(ClassLoader classLoader, String str) {
        String strM7902 = C0048.m7902(m8853(), 24, 9, 3234);
        try {
            return m8854(classLoader == null ? C0021.m4369(str) : C0015.m3417(classLoader, str));
        } catch (ClassNotFoundException e) {
            StringBuffer stringBuffer = new StringBuffer(strM7902);
            C0051.m8251(stringBuffer, str);
            C0051.m8251(stringBuffer, C0046.m7718(m8853(), 61, 10, 2606));
            throw new C0355a(C0058.m9069(stringBuffer), e);
        } catch (Exception e2) {
            StringBuffer stringBuffer2 = new StringBuffer(strM7902);
            C0051.m8251(stringBuffer2, str);
            C0051.m8251(stringBuffer2, C0061.m9361(m8853(), 33, 28, 1598));
            C0039.m6541(stringBuffer2, e2);
            throw new C0355a(C0058.m9069(stringBuffer2), e2);
        }
    }

    /* renamed from: ۣۣ۟ۨۨ, reason: not valid java name and contains not printable characters */
    public static short[] m8853() {
        if (C0017.m3633() <= 0) {
            return f840short;
        }
        return null;
    }

    /* renamed from: ۣ۟ۧۥۥ, reason: not valid java name and contains not printable characters */
    public static Object m8854(Object obj) {
        if (C0059.m9257() < 0) {
            return ((Class) obj).newInstance();
        }
        return null;
    }
}