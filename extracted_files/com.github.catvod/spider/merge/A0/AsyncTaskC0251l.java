package com.github.catvod.spider.merge.a0;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.widget.ImageView;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d1.C0049;
import java.net.URL;

/* renamed from: com.github.catvod.spider.merge.a0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AsyncTaskC0251l extends AsyncTask {
    public final ImageView a;

    public AsyncTaskC0251l(ImageView imageView) {
        this.a = imageView;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        try {
            return C0040.m6659(C0046.m7713(new URL(((String[]) objArr)[0])));
        } catch (Exception e) {
            C0049.m7975(e);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            C0022.m4421(C0030.m5403(this), bitmap);
        }
    }
}