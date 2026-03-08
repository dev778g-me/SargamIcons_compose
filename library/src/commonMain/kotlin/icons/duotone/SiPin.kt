package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiPin: ImageVector
    get() {
        if (_SiPin != null) {
            return _SiPin!!
        }
        _SiPin = ImageVector.Builder(
            name = "Duotone.SiPin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.374f, 4.809f)
                arcToRelative(8.017f, 8.017f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.258f, 0f)
                curveToRelative(3.15f, 3.098f, 3.15f, 8.056f, 0.041f, 11.113f)
                lineToRelative(-5.67f, 5.578f)
                lineToRelative(-5.671f, -5.578f)
                arcToRelative(7.74f, 7.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -11.072f)
                close()
                moveTo(12f, 7.5f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4f)
            }
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
