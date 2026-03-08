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

val Sargam.Duotone.SiArchive: ImageVector
    get() {
        if (_SiArchive != null) {
            return _SiArchive!!
        }
        _SiArchive = ImageVector.Builder(
            name = "Duotone.SiArchive",
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
                moveTo(16f, 7f)
                horizontalLineTo(7.95f)
                verticalLineToRelative(1.45f)
                curveToRelative(0f, 0.856f, 0.694f, 1.55f, 1.55f, 1.55f)
                horizontalLineToRelative(4.95f)
                arcTo(1.55f, 1.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 8.45f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveToRelative(21f, 7f)
                lineToRelative(-1f, 11.6f)
                curveToRelative(0f, 1.33f, -1.07f, 2.4f, -2.4f, 2.4f)
                horizontalLineTo(6.4f)
                curveTo(5.07f, 21f, 4f, 19.93f, 4f, 18.6f)
                lineTo(3f, 7f)
                moveToRelative(13f, 0f)
                verticalLineToRelative(2.2f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.8f, 0.8f)
                horizontalLineTo(8.8f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.8f, -0.8f)
                verticalLineTo(7f)
                moveTo(2.6f, 3f)
                horizontalLineToRelative(18.8f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 4.6f)
                verticalLineToRelative(0.8f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.4f, 7f)
                horizontalLineTo(2.6f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 5.4f)
                verticalLineToRelative(-0.8f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.6f, 3f)
            }
        }.build()

        return _SiArchive!!
    }

@Suppress("ObjectPropertyName")
private var _SiArchive: ImageVector? = null
