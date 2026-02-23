package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.t.C0061;

/* loaded from: classes.dex */
enum T0 extends h1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f230short = {1036, 1067, 1081, 1064, 1087, 1033, 1058, 1070, 1081, 1076, 1085, 1064, 1053, 1080, 1071, 1057, 1060, 1070, 1028, 1065, 1064, 1059, 1081, 1060, 1067, 1060, 1064, 1087};

    T0() {
        super(C0061.m9361(f230short, 0, 28, 1101), 58, null);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.h1
    final void g(Q q, C0067a c0067a) {
        h1 h1Var;
        C0072c0 c0072c0 = h1.c;
        char cE = c0067a.e();
        if (cE == '\t' || cE == '\n' || cE == '\f' || cE == '\r' || cE == ' ') {
            h1Var = h1.j0;
        } else if (cE == '\"') {
            q.q(this);
            h1Var = h1.m0;
        } else {
            if (cE != '\'') {
                if (cE != '>') {
                    if (cE != 65535) {
                        q.q(this);
                        q.m.f = true;
                        h1Var = h1.p0;
                    } else {
                        q.p(this);
                        q.m.f = true;
                    }
                }
                q.n();
                q.u(c0072c0);
                return;
            }
            q.q(this);
            h1Var = h1.n0;
        }
        q.u(h1Var);
    }
}