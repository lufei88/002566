package com.github.catvod.spider.merge.V0;

import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;

/* loaded from: classes.dex */
public final class s extends t {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f645short = {1202, 1252, 1207, 1257, 1207, 1617, 1543, 1620, 1031, 1107, 1106, 1097, 1045, 1048, 1102, 1044, 1459, 1509, 1462, 1469, 1462, 324, 274, 321, 351, 321};
    public final /* synthetic */ int b;

    public s(n nVar, int i) {
        this.b = i;
        switch (i) {
            case 1:
                this.a = nVar;
                break;
            case 2:
                this.a = nVar;
                break;
            case 3:
                this.a = nVar;
                break;
            case 4:
                this.a = nVar;
                break;
            default:
                this.a = nVar;
                break;
        }
    }

    /* renamed from: ۟۟ۥۤۤ, reason: not valid java name and contains not printable characters */
    public static short[] m5910() {
        if (C0026.m4977() < 0) {
            return f645short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.V0.n
    public final boolean a(com.github.catvod.spider.merge.T0.m mVar, com.github.catvod.spider.merge.T0.m mVar2) {
        com.github.catvod.spider.merge.T0.m mVar3;
        com.github.catvod.spider.merge.T0.m mVarM8640;
        com.github.catvod.spider.merge.T0.m mVarM86402 = mVar2;
        switch (C0029.m5234(this)) {
            case 0:
                return (mVar == mVarM86402 || (mVar3 = (com.github.catvod.spider.merge.T0.m) C0044.m7395(mVarM86402)) == null || !C0012.m3021(C0036.m6231(this), mVar, mVar3)) ? false : true;
            case 1:
                return (mVar == mVarM86402 || (mVarM8640 = C0054.m8640(mVarM86402)) == null || !C0012.m3021(C0036.m6231(this), mVar, mVarM8640)) ? false : true;
            case 2:
                return !C0012.m3021(C0036.m6231(this), mVar, mVarM86402);
            case 3:
                if (mVar == mVarM86402) {
                    return false;
                }
                com.github.catvod.spider.merge.T0.r rVarM7395 = C0044.m7395(mVarM86402);
                while (true) {
                    com.github.catvod.spider.merge.T0.m mVar4 = (com.github.catvod.spider.merge.T0.m) rVarM7395;
                    if (mVar4 == null) {
                        return false;
                    }
                    if (C0012.m3021(C0036.m6231(this), mVar, mVar4)) {
                        return true;
                    }
                    if (mVar4 == mVar) {
                        return false;
                    }
                    rVarM7395 = C0044.m7395(mVar4);
                }
            default:
                if (mVar == mVarM86402) {
                    return false;
                }
                do {
                    mVarM86402 = C0054.m8640(mVarM86402);
                    if (mVarM86402 == null) {
                        return false;
                    }
                } while (!C0012.m3021(C0036.m6231(this), mVar, mVarM86402));
                return true;
        }
    }

    public final String toString() {
        switch (C0029.m5234(this)) {
            case 0:
                return C0002.m1327(C0051.m8259(m5910(), 21, 5, 353), new Object[]{C0036.m6231(this)});
            case 1:
                return C0002.m1327(C0013.m3106(m5910(), 16, 5, 1430), new Object[]{C0036.m6231(this)});
            case 2:
                return C0002.m1327(C0006.m1774(m5910(), 8, 8, 1085), new Object[]{C0036.m6231(this)});
            case 3:
                return C0002.m1327(C0056.m8911(m5910(), 5, 3, 1652), new Object[]{C0036.m6231(this)});
            default:
                return C0002.m1327(C0061.m9361(m5910(), 0, 5, 1175), new Object[]{C0036.m6231(this)});
        }
    }
}