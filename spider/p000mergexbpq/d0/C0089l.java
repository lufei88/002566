package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.R.C0003;

/* renamed from: com.github.catvod.spider.merge-xbpq.d0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
enum C0089l extends A {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f274short = {428, 395, 419, 407, 388, 392, 384, 406, 384, 401, 1610, 1630, 1613, 1601, 1609, 1631, 1609, 1624, 543, 515, 538, 539, 2996, 2997, 3004, 2984, 3003, 2999, 3007, 2985, 1469, 1449, 1466, 1462, 1470};

    C0089l() {
        super(C0052.m8337(f274short, 0, 10, 485), 18, null);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.A
    final boolean d(O o, C0069b c0069b) {
        A a;
        if (A.a(o)) {
            c0069b.E((H) o);
        } else if (o.b()) {
            c0069b.F((I) o);
        } else {
            if (o.c()) {
                c0069b.n(this);
                return false;
            }
            boolean zF = o.f();
            String strM8814 = C0055.m8814(f274short, 10, 8, 1580);
            String strM9585 = C0063.m9585(f274short, 18, 4, 631);
            if (zF) {
                M m = (M) o;
                String str = m.c;
                str.getClass();
                char c = 65535;
                switch (str.hashCode()) {
                    case -1644953643:
                        if (str.equals(strM8814)) {
                            c = 0;
                            break;
                        }
                        break;
                    case 3213227:
                        if (str.equals(strM9585)) {
                            c = 1;
                            break;
                        }
                        break;
                    case 97692013:
                        if (str.equals(C0017.m3646(f274short, 30, 5, 1499))) {
                            c = 2;
                            break;
                        }
                        break;
                    case 1192721831:
                        if (str.equals(C0003.m1398(f274short, 22, 8, 3034))) {
                            c = 3;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        c0069b.D(m);
                        break;
                    case 1:
                        a = A.i;
                        break;
                    case 2:
                        c0069b.G(m);
                        break;
                    case 3:
                        a = A.f;
                        break;
                    default:
                        c0069b.n(this);
                        break;
                }
                return false;
            }
            if (o.e() && ((L) o).c.equals(strM8814)) {
                if (c0069b.a().d0().equals(strM9585)) {
                    c0069b.n(this);
                    return false;
                }
                c0069b.U();
                if (!c0069b.a().d0().equals(strM8814)) {
                    c0069b.j0(A.v);
                }
            } else {
                if (!o.d()) {
                    c0069b.n(this);
                    return false;
                }
                if (!c0069b.a().d0().equals(strM9585)) {
                    c0069b.n(this);
                }
            }
        }
        return true;
    }
}