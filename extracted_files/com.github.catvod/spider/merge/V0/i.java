package com.github.catvod.spider.merge.V0;

import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;

/* loaded from: classes.dex */
public final class i extends n {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f638short = {1398, 1312, 1336, 1380, 1385, 1320, 1381, 1127, 1082, 1065, 1141, 1144, 1081, 1140, 3119, 3184, 3172, 3133, 3120, 3185, 3132};
    public final int a;
    public final /* synthetic */ int b;

    public i(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    /* renamed from: ۟ۧۤۦ, reason: not valid java name and contains not printable characters */
    public static short[] m5903() {
        if (C0063.m9589() <= 0) {
            return f638short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.V0.n
    public final boolean a(com.github.catvod.spider.merge.T0.m mVar, com.github.catvod.spider.merge.T0.m mVar2) {
        switch (C0053.m8395(this)) {
            case 0:
                if (C0047.m7810(mVar2) == C0055.m8787(this)) {
                }
                break;
            case 1:
                if (C0047.m7810(mVar2) > C0055.m8787(this)) {
                }
                break;
            default:
                if (mVar == mVar2 || C0047.m7810(mVar2) >= C0055.m8787(this)) {
                }
                break;
        }
        return false;
    }

    public final String toString() {
        int iM8787 = C0055.m8787(this);
        switch (C0053.m8395(this)) {
            case 0:
                return C0002.m1327(C0040.m6584(m5903(), 14, 7, 3093), new Object[]{C0011.m2808(iM8787)});
            case 1:
                return C0002.m1327(C0058.m9106(m5903(), 7, 7, 1117), new Object[]{C0011.m2808(iM8787)});
            default:
                return C0002.m1327(C0048.m7902(m5903(), 0, 7, 1356), new Object[]{C0011.m2808(iM8787)});
        }
    }
}