package com.github.catvod.spider.p000mergexbpq.e0;

import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.c0.l;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class L extends N {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f315short = {854, 769, 781, 792, 783, 772, 777, 799, 803, 795, 770, 836, 841, 799, 837};
    private final Pattern a;

    public L(Pattern pattern) {
        this.a = pattern;
    }

    /* renamed from: ۟ۦۧۡۦ, reason: not valid java name and contains not printable characters */
    public static short[] m2650() {
        if (C0006.m1726() < 0) {
            return f315short;
        }
        return null;
    }

    /* renamed from: ۢۢۢۧ, reason: not valid java name and contains not printable characters */
    public static Pattern m2651(Object obj) {
        if (C0050.m8121() < 0) {
            return ((L) obj).a;
        }
        return null;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.e0.N
    public final boolean a(l lVar, l lVar2) {
        return C0003.m1405(C0034.m6026(m2651(this), C0065.m9718(lVar2)));
    }

    public final String toString() {
        return C0002.m1327(C0041.m6779(m2650(), 0, 15, 876), new Object[]{m2651(this)});
    }
}