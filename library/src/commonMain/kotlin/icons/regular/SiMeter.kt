package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiMeter: ImageVector
    get() {
        if (_SiMeter != null) {
            return _SiMeter!!
        }
        _SiMeter = ImageVector.Builder(
            name = "Regular.SiMeter",
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
                moveTo(12.707f, 15.293f)
                lineTo(18f, 10f)
                moveToRelative(1.806f, 10f)
                arcToRelative(9.77f, 9.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.13f, -5.037f)
                arcToRelative(9.7f, 9.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.922f, -5.38f)
                arcToRelative(9.9f, 9.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.69f, -4.071f)
                arcTo(10.1f, 10.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 4f)
                curveToRelative(-1.884f, 0f, -3.73f, 0.524f, -5.324f, 1.512f)
                arcToRelative(9.9f, 9.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.69f, 4.07f)
                arcToRelative(9.7f, 9.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.921f, 5.38f)
                arcTo(9.77f, 9.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.194f, 20f)
                close()
                moveTo(13f, 16f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
            }
        }.build()

        return _SiMeter!!
    }

@Suppress("ObjectPropertyName")
private var _SiMeter: ImageVector? = null
