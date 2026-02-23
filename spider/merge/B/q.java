package com.github.catvod.spider.merge.B;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.x.C0015;

/* loaded from: classes.dex */
public final class q extends Fragment {
    public static final /* synthetic */ int a = 0;

    /* renamed from: short, reason: not valid java name */
    private static final short[] f378short = {3287, 3294, 3281, 3291, 3283, 3290, 3315, 3286, 3289, 3290, 3292, 3270, 3292, 3283, 3290, 3322, 3273, 3290, 3281, 3275};

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, g gVar) {
        if (activity instanceof k) {
            i iVarM7644 = C0045.m7644((k) activity);
            if (iVarM7644 instanceof l) {
                l lVar = (l) iVarM7644;
                C0049.m7982(lVar, C0001.m1189(m3623(), 0, 20, 3263));
                C0057.m9041(lVar, C0063.m9560(gVar));
            }
        }
    }

    /* renamed from: ۦۢۡ۠, reason: contains not printable characters */
    public static short[] m3623() {
        if (C0056.m8886() < 0) {
            return f378short;
        }
        return null;
    }

    public final void b(g gVar) {
        if (C0054.m8632() < 29) {
            C0002.m1304(C0021.m4338(this), gVar);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C0042.m7167(this, C0015.m3415());
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C0042.m7167(this, C0011.m2769());
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        C0042.m7167(this, C0051.m8261());
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        C0042.m7167(this, C0063.m9583());
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        C0042.m7167(this, C0027.m5090());
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        C0042.m7167(this, C0048.m7960());
    }
}