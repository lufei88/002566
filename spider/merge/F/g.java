package com.github.catvod.spider.merge.F;

import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public class g {

    @SerializedName("default_drive_id")
    private String a;

    @SerializedName("resource_drive_id")
    private String b;

    /* renamed from: ۣ۟ۢۥۧ, reason: not valid java name and contains not printable characters */
    public static String m3812(Object obj) {
        if (C0061.m9359() <= 0) {
            return ((g) obj).b;
        }
        return null;
    }

    /* renamed from: ۣ۠۠, reason: not valid java name and contains not printable characters */
    public static String m3813(Object obj) {
        if (C0004.m1557() <= 0) {
            return ((g) obj).a;
        }
        return null;
    }

    public final String a() {
        boolean zM7327 = C0043.m7327(m3812(this));
        String strM1840 = C0007.m1840();
        return C0057.m8953(zM7327 ? strM1840 : m3812(this)) ? C0043.m7327(m3813(this)) ? strM1840 : m3813(this) : C0043.m7327(m3812(this)) ? strM1840 : m3812(this);
    }
}