package com.github.catvod.spider.merge.T0;

import android.os.Bundle;
import android.view.View;
import androidx.core.view.inputmethod.InputConnectionCompat;
import androidx.core.view.inputmethod.InputContentInfoCompat;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements com.github.catvod.spider.merge.V0.o, InputConnectionCompat.OnCommitContentListener {
    public final /* synthetic */ Object a;

    public /* synthetic */ j(Object obj) {
        this.a = obj;
    }

    /* renamed from: ۟ۧ۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static boolean m5321(Object obj, Object obj2, int i, Object obj3) {
        if (C0020.m4210() <= 0) {
            return InputConnectionCompat.a((View) obj, (InputContentInfoCompat) obj2, i, (Bundle) obj3);
        }
        return false;
    }

    @Override // com.github.catvod.spider.merge.V0.o
    public void a(r rVar, int i) {
        C0023.m4614(rVar, (StringBuilder) C0024.m4678(this));
    }

    @Override // com.github.catvod.spider.merge.V0.o
    public /* synthetic */ void b(r rVar, int i) {
    }

    public boolean onCommitContent(InputContentInfoCompat inputContentInfoCompat, int i, Bundle bundle) {
        return m5321((View) C0024.m4678(this), inputContentInfoCompat, i, bundle);
    }
}