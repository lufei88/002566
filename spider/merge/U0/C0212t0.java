package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.V.C0031;

/* renamed from: com.github.catvod.spider.merge.U0.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum C0212t0 extends g1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f613short = {1830, 1793, 1811, 1794, 1813, 1830, 1811, 1811, 1813, 1806, 1797, 1810, 1811, 1794, 1833, 1798, 1802, 1794};

    public C0212t0() {
        super(C0031.m5565(f613short, 0, 18, 1895), 35);
    }

    @Override // com.github.catvod.spider.merge.U0.g1
    public final void d(P p, C0174a c0174a) {
        g1 g1Var;
        char cE = c0174a.e();
        C0210s0 c0210s0 = g1.I;
        if (cE == 0) {
            p.m(this);
            M m = p.k;
            m.f = true;
            String str = m.e;
            StringBuilder sb = m.d;
            if (str != null) {
                sb.append(str);
                m.e = null;
            }
            sb.append((char) 65533);
        } else {
            if (cE == ' ') {
                return;
            }
            if (cE != '\"' && cE != '\'') {
                if (cE != '/') {
                    C0177b0 c0177b0 = g1.a;
                    if (cE != 65535) {
                        if (cE == '\t' || cE == '\n' || cE == '\f' || cE == '\r') {
                            return;
                        }
                        switch (cE) {
                            case '<':
                                break;
                            case '=':
                                g1Var = g1.K;
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
                g1Var = g1.P;
                p.o(g1Var);
                return;
            }
            p.m(this);
            p.k.o();
            M m2 = p.k;
            m2.f = true;
            String str2 = m2.e;
            StringBuilder sb2 = m2.d;
            if (str2 != null) {
                sb2.append(str2);
                m2.e = null;
            }
            sb2.append(cE);
        }
        p.o(c0210s0);
    }
}