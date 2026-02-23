package com.github.catvod.spider.merge.F;

import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes.dex */
public class j {

    @SerializedName("live_transcoding_task_list")
    private List<k> a;

    @SerializedName("live_transcoding_subtitle_task_list")
    private List<k> b;

    /* renamed from: ۣ۟ۢۦۢ, reason: not valid java name and contains not printable characters */
    public static List m3828(Object obj) {
        if (C0022.m4497() >= 0) {
            return ((j) obj).b;
        }
        return null;
    }

    /* renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static List m3829(Object obj) {
        if (C0019.m4065() <= 0) {
            return ((j) obj).a;
        }
        return null;
    }

    public final List a() {
        List listM3828 = m3828(this);
        return listM3828 == null ? C0008.m1961() : listM3828;
    }

    public final List b() {
        List listM3829 = m3829(this);
        return listM3829 == null ? C0008.m1961() : listM3829;
    }
}