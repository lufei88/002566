package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;

/* loaded from: classes.dex */
public enum b1 extends g1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f572short = {1922, 1957, 1952, 1973, 1952, 1938, 1956, 1954, 1973, 1960, 1966, 1967, 692, 692, 727};

    public b1() {
        super(C0024.m4740(f572short, 0, 12, 1985), 66);
    }

    @Override // com.github.catvod.spider.merge.U0.g1
    public final void d(P p, C0174a c0174a) {
        String strC;
        String strM1970 = C0008.m1970(f572short, 12, 3, 745);
        int iV = c0174a.v(strM1970);
        if (iV != -1) {
            strC = C0174a.c(c0174a.a, c0174a.h, c0174a.e, iV);
            c0174a.e += iV;
        } else {
            int i = c0174a.c;
            int i2 = c0174a.e;
            if (i - i2 < 3) {
                c0174a.b();
                char[] cArr = c0174a.a;
                String[] strArr = c0174a.h;
                int i3 = c0174a.e;
                strC = C0174a.c(cArr, strArr, i3, c0174a.c - i3);
                c0174a.e = c0174a.c;
            } else {
                int i4 = i - 2;
                strC = C0174a.c(c0174a.a, c0174a.h, i2, i4 - i2);
                c0174a.e = i4;
            }
        }
        p.h.append(strC);
        if (c0174a.p(strM1970) || c0174a.n()) {
            p.f(new F(p.h.toString()));
            p.o(g1.a);
        }
    }
}