package com.github.catvod.spider.merge.F;

import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes.dex */
public class n {

    @SerializedName("responses")
    private List<n> a;

    @SerializedName("body")
    private m b;

    @SerializedName("id")
    private String c;

    @SerializedName("status")
    private int d;

    /* renamed from: ۟ۦۦ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m3835(Object obj) {
        if (C0063.m9589() < 0) {
            return ((n) obj).d;
        }
        return 0;
    }

    /* renamed from: ۢۤۥۧ, reason: not valid java name and contains not printable characters */
    public static List m3836(Object obj) {
        if (C0026.m4977() < 0) {
            return ((n) obj).a;
        }
        return null;
    }

    /* renamed from: ۤۤۢ, reason: not valid java name and contains not printable characters */
    public static m m3837(Object obj) {
        if (C0059.m9257() < 0) {
            return ((n) obj).b;
        }
        return null;
    }

    public final m a() {
        m mVarM3837 = m3837(this);
        return mVarM3837 == null ? new m() : mVarM3837;
    }

    public final n b() {
        List listM3836 = m3836(this);
        if (listM3836 == null) {
            listM3836 = C0008.m1961();
        }
        if (C0035.m6132(listM3836)) {
            return new n();
        }
        List listM38362 = m3836(this);
        if (listM38362 == null) {
            listM38362 = C0008.m1961();
        }
        return (n) C0048.m7915(listM38362, 0);
    }

    public final int c() {
        return m3835(this);
    }
}