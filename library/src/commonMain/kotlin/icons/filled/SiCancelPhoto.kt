package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiCancelPhoto: ImageVector
    get() {
        if (_SiCancelPhoto != null) {
            return _SiCancelPhoto!!
        }
        _SiCancelPhoto = ImageVector.Builder(
            name = "Filled.SiCancelPhoto",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.4f, 2f)
                horizontalLineToRelative(11.2f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 4.4f)
                verticalLineToRelative(11.2f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.4f, 2.4f)
                horizontalLineTo(8.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 15.6f)
                verticalLineTo(4.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.4f, 2f)
                moveToRelative(3.479f, 4.464f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.415f, 1.415f)
                lineTo(12.587f, 10f)
                lineToRelative(-2.122f, 2.121f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.415f, 1.415f)
                lineTo(14f, 11.414f)
                lineToRelative(2.121f, 2.122f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.415f, -1.415f)
                lineTo(15.414f, 10f)
                lineToRelative(2.122f, -2.121f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.415f, -1.415f)
                lineToRelative(-2.12f, 2.122f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineToRelative(11.6f)
                curveTo(2f, 19.132f, 4.868f, 22f, 8.4f, 22f)
                horizontalLineTo(20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -2f)
                horizontalLineTo(8.4f)
                arcTo(4.403f, 4.403f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 15.6f)
                close()
            }
        }.build()

        return _SiCancelPhoto!!
    }

@Suppress("ObjectPropertyName")
private var _SiCancelPhoto: ImageVector? = null
