package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.f.C0051;

/* renamed from: com.github.catvod.spider.merge.U0.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum C0208r0 extends g1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f609short = {848, 887, 884, 893, 864, 887, 851, 870, 870, 864, 891, 880, 871, 870, 887, 860, 883, 895, 887};

    public C0208r0() {
        super(C0051.m8259(f609short, 0, 19, 786), 33);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.github.catvod.spider.merge.U0.g1
    public final void d(P p, C0174a c0174a) {
        char cE = c0174a.e();
        C0210s0 c0210s0 = g1.I;
        if (cE == 0) {
            c0174a.z();
            p.m(this);
            p.k.o();
        } else {
            if (cE == ' ') {
                return;
            }
            if (cE != '\"' && cE != '\'') {
                if (cE == '/') {
                    p.o(g1.P);
                    return;
                }
                C0177b0 c0177b0 = g1.a;
                if (cE != 65535) {
                    if (cE == '\t' || cE == '\n' || cE == '\f' || cE == '\r') {
                        return;
                    }
                    switch (cE) {
                        case '<':
                            c0174a.z();
                            p.m(this);
                            p.k();
                            break;
                        case '=':
                            break;
                        case '>':
                            p.k();
                            break;
                        default:
                            p.k.o();
                            c0174a.z();
                            p.o(c0210s0);
                            break;
                    }
                    return;
                }
                p.l(this);
                p.o(c0177b0);
                return;
            }
            p.m(this);
            p.k.o();
            M m = p.k;
            m.f = true;
            String str = m.e;
            StringBuilder sb = m.d;
            if (str != null) {
                sb.append(str);
                m.e = null;
            }
            sb.append(cE);
        }
        p.o(c0210s0);
    }
}