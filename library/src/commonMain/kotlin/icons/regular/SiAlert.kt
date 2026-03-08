package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiAlert: ImageVector
    get() {
        if (_SiAlert != null) {
            return _SiAlert!!
        }
        _SiAlert = ImageVector.Builder(
            name = "Regular.SiAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 16f)
                horizontalLineToRelative(0.008f)
                moveTo(12f, 10f)
                verticalLineToRelative(3f)
                moveToRelative(-1.425f, -7.783f)
                lineTo(3.517f, 17f)
                arcToRelative(1.667f, 1.667f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.425f, 2.5f)
                horizontalLineToRelative(14.116f)
                arcToRelative(1.666f, 1.666f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.425f, -2.5f)
                lineTo(13.426f, 5.217f)
                arcToRelative(1.666f, 1.666f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.85f, 0f)
            }
        }.build()

        return _SiAlert!!
    }

@Suppress("ObjectPropertyName")
private var _SiAlert: ImageVector? = null
