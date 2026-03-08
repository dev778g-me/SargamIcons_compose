package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiPin: ImageVector
    get() {
        if (_SiPin != null) {
            return _SiPin!!
        }
        _SiPin = ImageVector.Builder(
            name = "Regular.SiPin",
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
                moveTo(17.632f, 4.809f)
                curveToRelative(3.15f, 3.098f, 3.15f, 8.056f, 0.042f, 11.113f)
                lineTo(12.003f, 21.5f)
                lineTo(6.33f, 15.922f)
                arcToRelative(7.74f, 7.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -11.072f)
                lineToRelative(0.042f, -0.041f)
                arcToRelative(8.017f, 8.017f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.259f, 0f)
                moveToRelative(0f, 0f)
                quadToRelative(-0.063f, -0.063f, 0f, 0f)
                moveTo(14f, 9.5f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 0f)
            }
        }.build()

        return _SiPin!!
    }

@Suppress("ObjectPropertyName")
private var _SiPin: ImageVector? = null
