package com.github.catvod.spider.merge.t0;

import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.r0.InterfaceC0364a;
import com.github.catvod.spider.p000mergexbpq.x.C0016;

/* renamed from: com.github.catvod.spider.merge.t0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0373f extends AbstractC0372e {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f861short = {2377, 2381, 2390, 2382, 2379, 2380, 2316, 2376, 2388, 2383, 2316, 2372, 2391, 2380, 2369, 2390, 2379, 2381, 2380, 2385, 2316, 1417, 1438, 1429, 1439, 1438, 1417, 1463, 1434, 1430, 1433, 1439, 1434, 1455, 1428, 1448, 1423, 1417, 1426, 1429, 1436, 1491, 1493, 1493, 1493, 1490};
    private final int arity;

    public AbstractC0373f(InterfaceC0364a interfaceC0364a) {
        super(interfaceC0364a);
        this.arity = 2;
    }

    /* renamed from: ۟ۦۣۢ۠, reason: not valid java name and contains not printable characters */
    public static int m9365(Object obj) {
        if (C0051.m8216() < 0) {
            return ((AbstractC0373f) obj).arity;
        }
        return 0;
    }

    /* renamed from: ۣ۟ۧ۠۟, reason: not valid java name and contains not printable characters */
    public static short[] m9366() {
        if (C0046.m7701() > 0) {
            return f861short;
        }
        return null;
    }

    public int getArity() {
        return m9365(this);
    }

    @Override // com.github.catvod.spider.merge.t0.AbstractC0368a
    public String toString() {
        if (C0050.m8089(this) != null) {
            return super.toString();
        }
        C0047.m7777(C0041.m6755());
        String strM6312 = C0037.m6312(C0019.m4102(C0047.m7777(this))[0]);
        if (C0043.m7277(strM6312, C0047.m7833(m9366(), 0, 21, 2338))) {
            strM6312 = C0056.m8890(strM6312, 21);
        }
        C0055.m8753(strM6312, C0016.m3525(m9366(), 21, 25, 1531));
        return strM6312;
    }
}