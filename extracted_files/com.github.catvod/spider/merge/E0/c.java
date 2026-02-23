package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.x.C0016;

/* loaded from: classes.dex */
public final class c implements j {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f394short = {1989, 2020, 2047, 1963, 2041, 2030, 2026, 2024, 2019, 2030, 2031, 2313, 2344, 2355, 2407, 2357, 2338, 2342, 2340, 2351, 2338, 2339, 3089, 3120, 3115, 3199, 3117, 3130, 3134, 3132, 3127, 3130, 3131};
    public final int a;
    public int b = 0;
    public final /* synthetic */ int c;
    public final Object d;

    public c(Object obj, int i, int i2, int i3) {
        this.c = i3;
        this.a = i2;
        this.d = obj;
    }

    /* renamed from: ۣۣ۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static short[] m3779() {
        if (C0016.m3596() <= 0) {
            return f394short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.E0.j
    public final int a(int i) {
        char c;
        byte b;
        switch (C0031.m5600(this)) {
            case 0:
                int iM9331 = C0060.m9331(i);
                char[] cArr = (char[]) C0027.m5082(this);
                if (iM9331 == -1) {
                    int iM8228 = C0051.m8228(this) + i;
                    if (iM8228 < 0) {
                        return -1;
                    }
                    c = cArr[iM8228];
                } else {
                    if (iM9331 == 0) {
                        return 0;
                    }
                    if (iM9331 != 1) {
                        throw new UnsupportedOperationException(C0022.m4403(m3779(), 22, 11, 3167));
                    }
                    int iM82282 = (C0051.m8228(this) + i) - 1;
                    if (iM82282 >= C0027.m5001(this)) {
                        return -1;
                    }
                    c = cArr[iM82282];
                }
                return c & 65535;
            case 1:
                int iM93312 = C0060.m9331(i);
                int[] iArr = (int[]) C0027.m5082(this);
                if (iM93312 == -1) {
                    int iM82283 = C0051.m8228(this) + i;
                    if (iM82283 < 0) {
                        return -1;
                    }
                    return iArr[iM82283];
                }
                if (iM93312 == 0) {
                    return 0;
                }
                if (iM93312 != 1) {
                    throw new UnsupportedOperationException(C0005.m1645(m3779(), 11, 11, 2375));
                }
                int iM82284 = (C0051.m8228(this) + i) - 1;
                if (iM82284 >= C0027.m5001(this)) {
                    return -1;
                }
                return iArr[iM82284];
            default:
                int iM93313 = C0060.m9331(i);
                byte[] bArr = (byte[]) C0027.m5082(this);
                if (iM93313 == -1) {
                    int iM82285 = C0051.m8228(this) + i;
                    if (iM82285 < 0) {
                        return -1;
                    }
                    b = bArr[iM82285];
                } else {
                    if (iM93313 == 0) {
                        return 0;
                    }
                    if (iM93313 != 1) {
                        throw new UnsupportedOperationException(C0037.m6307(m3779(), 0, 11, 1931));
                    }
                    int iM82286 = (C0051.m8228(this) + i) - 1;
                    if (iM82286 >= C0027.m5001(this)) {
                        return -1;
                    }
                    b = bArr[iM82286];
                }
                return b & 255;
        }
    }

    public final String b(com.github.catvod.spider.merge.H0.e eVar) {
        switch (C0031.m5600(this)) {
            case 0:
                int iM5636 = C0031.m5636(eVar);
                int iM5001 = C0027.m5001(this);
                int iM8186 = C0051.m8186(iM5636, iM5001);
                return new String((char[]) C0027.m5082(this), iM8186, C0051.m8186((C0030.m5364(eVar) - C0031.m5636(eVar)) + 1, iM5001 - iM8186));
            case 1:
                int iM56362 = C0031.m5636(eVar);
                int iM50012 = C0027.m5001(this);
                int iM81862 = C0051.m8186(iM56362, iM50012);
                return new String((int[]) C0027.m5082(this), iM81862, C0051.m8186((C0030.m5364(eVar) - C0031.m5636(eVar)) + 1, iM50012 - iM81862));
            default:
                int iM56363 = C0031.m5636(eVar);
                int iM50013 = C0027.m5001(this);
                int iM81863 = C0051.m8186(iM56363, iM50013);
                return new String((byte[]) C0027.m5082(this), iM81863, C0051.m8186((C0030.m5364(eVar) - C0031.m5636(eVar)) + 1, iM50013 - iM81863), C0017.m3686());
        }
    }

    public final String toString() {
        return C0051.m8179(this, C0059.m9209(0, C0027.m5001(this) - 1));
    }
}