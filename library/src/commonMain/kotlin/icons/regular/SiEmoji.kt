package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiEmoji: ImageVector
    get() {
        if (_SiEmoji != null) {
            return _SiEmoji!!
        }
        _SiEmoji = ImageVector.Builder(
            name = "Regular.SiEmoji",
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
                moveToRelative(16.583f, 14.083f)
                lineToRelative(-0.079f, 0.213f)
                arcTo(4.808f, 4.808f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.26f, 16.56f)
                arcToRelative(4.8f, 4.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.764f, -2.265f)
                lineToRelative(-0.08f, -0.213f)
                moveTo(9f, 9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                moveToRelative(8f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                moveToRelative(5f, 3f)
                curveToRelative(0f, -5.523f, -4.477f, -10f, -10f, -10f)
                reflectiveCurveTo(2f, 6.477f, 2f, 12f)
                reflectiveCurveToRelative(4.477f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.477f, 10f, -10f)
            }
        }.build()

        return _SiEmoji!!
    }

@Suppress("ObjectPropertyName")
private var _SiEmoji: ImageVector? = null
