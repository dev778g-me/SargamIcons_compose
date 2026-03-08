package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiCloud: ImageVector
    get() {
        if (_SiCloud != null) {
            return _SiCloud!!
        }
        _SiCloud = ImageVector.Builder(
            name = "Duotone.SiCloud",
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
                moveTo(4.178f, 18.555f)
                horizontalLineTo(18.28f)
                arcToRelative(4.7f, 4.7f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -9.4f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.783f, 0.07f)
                arcTo(6.267f, 6.267f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.87f, 11.042f)
                quadToRelative(-0.123f, 0.617f, -0.125f, 1.246f)
                verticalLineToRelative(0.446f)
                arcToRelative(3.133f, 3.133f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.567f, 5.82f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.178f, 18.555f)
                horizontalLineTo(18.28f)
                arcToRelative(4.7f, 4.7f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -9.4f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.783f, 0.07f)
                arcTo(6.267f, 6.267f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.87f, 11.042f)
                quadToRelative(-0.123f, 0.617f, -0.125f, 1.246f)
                verticalLineToRelative(0.446f)
                arcToRelative(3.133f, 3.133f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.567f, 5.82f)
                close()
            }
        }.build()

        return _SiCloud!!
    }

@Suppress("ObjectPropertyName")
private var _SiCloud: ImageVector? = null
