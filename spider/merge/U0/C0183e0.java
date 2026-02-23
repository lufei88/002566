package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.Y.C0036;

/* renamed from: com.github.catvod.spider.merge.U0.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum C0183e0 extends g1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f580short = {640, 688, 673, 698, 675, 679, 663, 690, 679, 690, 662, 672, 688, 690, 675, 694, 695};

    public C0183e0() {
        super(C0036.m6188(f580short, 0, 17, 723), 21);
    }

    @Override // com.github.catvod.spider.merge.U0.g1
    public final void d(P p, C0174a c0174a) {
        if (c0174a.n()) {
            p.l(this);
            p.o(g1.a);
            return;
        }
        char cL = c0174a.l();
        if (cL == 0) {
            p.m(this);
            c0174a.a();
            p.e((char) 65533);
            return;
        }
        if (cL == '-') {
            p.e('-');
            p.o(g1.w);
        } else {
            if (cL != '<') {
                p.g(c0174a.j('-', '<', 0));
                return;
            }
            p.o(g1.y);
        }
        p.a.a();
    }
}