package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.p000mergexbpq.j.C0013;

/* renamed from: com.github.catvod.spider.merge.U0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum C0200n extends B {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f600short = {412, 443, 403, 423, 436, 440, 432, 422, 432, 417, 1891, 1919, 1894, 1895, 1349, 1361, 1346, 1358, 1350, 1360, 1350, 1367, 948, 949, 956, 936, 955, 951, 959, 937, 705, 725, 710, 714, 706};

    public C0200n() {
        super(C0013.m3106(f600short, 0, 10, 469), 19);
    }

    @Override // com.github.catvod.spider.merge.U0.B
    public final boolean c(N n, C0176b c0176b) {
        String strM8259 = C0051.m8259(f600short, 10, 4, 1803);
        String strM5565 = C0031.m5565(f600short, 14, 8, 1315);
        if (B.a(n)) {
            c0176b.s((G) n);
        } else if (n.a()) {
            c0176b.t((H) n);
        } else {
            if (n.b()) {
                c0176b.h(this);
                return false;
            }
            if (n.e()) {
                L l = (L) n;
                String str = l.c;
                str.getClass();
                char c = 65535;
                switch (str.hashCode()) {
                    case -1644953643:
                        if (str.equals(strM5565)) {
                            c = 0;
                            break;
                        }
                        break;
                    case 3213227:
                        if (str.equals(strM8259)) {
                            c = 1;
                            break;
                        }
                        break;
                    case 97692013:
                        if (str.equals(C0022.m4403(f600short, 30, 5, 679))) {
                            c = 2;
                            break;
                        }
                        break;
                    case 1192721831:
                        if (str.equals(C0056.m8911(f600short, 22, 8, 986))) {
                            c = 3;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        c0176b.r(l);
                        break;
                    case 1:
                        C0219x c0219x = B.g;
                        c0176b.g = l;
                        return c0219x.c(l, c0176b);
                    case 2:
                        c0176b.u(l);
                        break;
                    case 3:
                        C0213u c0213u = B.d;
                        c0176b.g = l;
                        return c0213u.c(l, c0176b);
                    default:
                        c0176b.h(this);
                        return false;
                }
            } else if (n.d() && ((K) n).c.equals(strM5565)) {
                if (c0176b.g(strM8259)) {
                    c0176b.h(this);
                    return false;
                }
                c0176b.A();
                if (!c0176b.g(strM5565)) {
                    c0176b.l = B.u;
                }
            } else {
                if (!n.c()) {
                    c0176b.h(this);
                    return false;
                }
                if (!c0176b.g(strM8259)) {
                    c0176b.h(this);
                }
            }
        }
        return true;
    }
}