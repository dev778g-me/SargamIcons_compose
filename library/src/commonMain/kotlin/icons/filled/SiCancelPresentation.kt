package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiCancelPresentation: ImageVector
    get() {
        if (_SiCancelPresentation != null) {
            return _SiCancelPresentation!!
        }
        _SiCancelPresentation = ImageVector.Builder(
            name = "Filled.SiCancelPresentation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.4f, 4f)
                horizontalLineToRelative(17.2f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 6.4f)
                verticalLineToRelative(11.2f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.4f, 2.4f)
                horizontalLineTo(3.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 17.6f)
                verticalLineTo(6.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.4f, 4f)
                moveToRelative(13.55f, 3.05f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.414f)
                lineTo(13.414f, 12f)
                lineToRelative(3.536f, 3.536f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.414f, 1.414f)
                lineTo(12f, 13.414f)
                lineTo(8.464f, 16.95f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.414f, -1.414f)
                lineTo(10.586f, 12f)
                lineTo(7.05f, 8.464f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8.464f, 7.05f)
                lineTo(12f, 10.586f)
                lineToRelative(3.536f, -3.536f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.414f, 0f)
            }
        }.build()

        return _SiCancelPresentation!!
    }

@Suppress("ObjectPropertyName")
private var _SiCancelPresentation: ImageVector? = null
