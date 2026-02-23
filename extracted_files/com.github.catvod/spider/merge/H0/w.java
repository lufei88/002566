package com.github.catvod.spider.merge.h0;

import android.app.AlertDialog;
import android.app.Application;
import android.content.res.Configuration;
import android.widget.ScrollView;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.x.C0016;

/* loaded from: classes.dex */
public final class w extends ScrollView {
    public final /* synthetic */ x a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, Application application) {
        super(application);
        this.a = xVar;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        x xVarM8143 = C0050.m8143(this);
        C0040.m6589(xVarM8143);
        C0019.m4040(this);
        AlertDialog alertDialogM6522 = C0039.m6522(xVarM8143);
        if (alertDialogM6522 == null || !C0016.m3578(alertDialogM6522)) {
            return;
        }
        C0004.m1487(xVarM8143);
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, C0011.m2767(C0012.m2982(C0050.m8143(this)), Integer.MIN_VALUE));
    }
}