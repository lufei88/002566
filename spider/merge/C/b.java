package com.github.catvod.spider.merge.C;

import android.os.Parcel;
import android.util.SparseIntArray;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.e.C0272b;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0016;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f381short = {1409, 1409};
    public final SparseIntArray d;
    public final Parcel e;
    public final int f;
    public final int g;
    public final String h;
    public int i;
    public int j;
    public int k;

    public b(Parcel parcel, int i, int i2, String str, C0272b c0272b, C0272b c0272b2, C0272b c0272b3) {
        super(c0272b, c0272b2, c0272b3);
        this.d = new SparseIntArray();
        this.i = -1;
        this.k = -1;
        this.e = parcel;
        this.f = i;
        this.g = i2;
        this.j = i;
        this.h = str;
    }

    /* renamed from: ۟۠ۥ۟ۧ, reason: not valid java name and contains not printable characters */
    public static short[] m3632() {
        if (C0009.m2047() > 0) {
            return f381short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.C.a
    public final b a() {
        Parcel parcelM8887 = C0056.m8887(this);
        int iM5675 = C0032.m5675(parcelM8887);
        int iM9490 = C0063.m9490(this);
        if (iM9490 == C0025.m4842(this)) {
            iM9490 = C0009.m2121(this);
        }
        return new b(parcelM8887, iM5675, iM9490, C0028.m5188(new StringBuilder(), C0016.m3553(this), C0021.m4340(m3632(), 0, 2, 1441)), C0014.m3300(this), C0010.m2309(this), C0056.m8905(this));
    }

    @Override // com.github.catvod.spider.merge.C.a
    public final boolean e(int i) {
        while (C0063.m9490(this) < C0009.m2121(this)) {
            int iM4997 = C0027.m4997(this);
            if (iM4997 == i) {
                return true;
            }
            if (C0050.m8124(C0054.m8599(iM4997), C0054.m8599(i)) > 0) {
                return false;
            }
            int iM9490 = C0063.m9490(this);
            Parcel parcelM8887 = C0056.m8887(this);
            C0010.m2311(parcelM8887, iM9490);
            int iM5760 = C0032.m5760(parcelM8887);
            this.k = C0032.m5760(parcelM8887);
            this.j = C0063.m9490(this) + iM5760;
        }
        return C0027.m4997(this) == i;
    }

    @Override // com.github.catvod.spider.merge.C.a
    public final void h(int i) {
        int iM1235 = C0001.m1235(this);
        SparseIntArray sparseIntArrayM7829 = C0047.m7829(this);
        Parcel parcelM8887 = C0056.m8887(this);
        if (iM1235 >= 0) {
            int iM1191 = C0001.m1191(sparseIntArrayM7829, iM1235);
            int iM5675 = C0032.m5675(parcelM8887);
            C0010.m2311(parcelM8887, iM1191);
            C0033.m5818(parcelM8887, iM5675 - iM1191);
            C0010.m2311(parcelM8887, iM5675);
        }
        this.i = i;
        C0030.m5347(sparseIntArrayM7829, i, C0032.m5675(parcelM8887));
        C0033.m5818(parcelM8887, 0);
        C0033.m5818(parcelM8887, i);
    }
}