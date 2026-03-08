package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiMovie: ImageVector
    get() {
        if (_SiMovie != null) {
            return _SiMovie!!
        }
        _SiMovie = ImageVector.Builder(
            name = "Duotone.SiMovie",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f
            ) {
                moveTo(23f, 9f)
                horizontalLineTo(1f)
                verticalLineToRelative(9.6f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.4f, 21f)
                horizontalLineToRelative(17.2f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.4f, -2.4f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.289f, 8.763f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.422f, 0.474f)
                close()
                moveTo(17.712f, 3.237f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.424f, -0.474f)
                close()
                moveTo(6.288f, 8.763f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.424f, 0.474f)
                close()
                moveTo(9.712f, 3.237f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.424f, -0.474f)
                close()
                moveTo(3.4f, 3.75f)
                horizontalLineToRelative(17.2f)
                verticalLineToRelative(-1.5f)
                lineTo(3.4f, 2.25f)
                close()
                moveTo(20.6f, 3.75f)
                curveToRelative(0.911f, 0f, 1.65f, 0.739f, 1.65f, 1.65f)
                horizontalLineToRelative(1.5f)
                arcToRelative(3.15f, 3.15f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.15f, -3.15f)
                close()
                moveTo(22.25f, 5.4f)
                verticalLineToRelative(13.2f)
                horizontalLineToRelative(1.5f)
                lineTo(23.75f, 5.4f)
                close()
                moveTo(22.25f, 18.6f)
                arcToRelative(1.65f, 1.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.65f, 1.65f)
                verticalLineToRelative(1.5f)
                arcToRelative(3.15f, 3.15f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.15f, -3.15f)
                close()
                moveTo(20.6f, 20.25f)
                lineTo(3.4f, 20.25f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(17.2f)
                close()
                moveTo(3.4f, 20.25f)
                arcToRelative(1.65f, 1.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.65f, -1.65f)
                lineTo(0.25f, 18.6f)
                arcToRelative(3.15f, 3.15f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.15f, 3.15f)
                close()
                moveTo(1.75f, 18.6f)
                lineTo(1.75f, 5.4f)
                lineTo(0.25f, 5.4f)
                verticalLineToRelative(13.2f)
                close()
                moveTo(1.75f, 5.4f)
                curveToRelative(0f, -0.911f, 0.739f, -1.65f, 1.65f, -1.65f)
                verticalLineToRelative(-1.5f)
                arcTo(3.15f, 3.15f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.25f, 5.4f)
                close()
                moveTo(1f, 9.75f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(-1.5f)
                lineTo(1f, 8.25f)
                close()
                moveTo(15.712f, 9.237f)
                lineTo(17.712f, 3.237f)
                lineTo(16.288f, 2.763f)
                lineTo(14.288f, 8.763f)
                close()
                moveTo(7.712f, 9.237f)
                lineTo(9.712f, 3.237f)
                lineTo(8.288f, 2.763f)
                lineTo(6.288f, 8.763f)
                close()
            }
        }.build()

        return _SiMovie!!
    }

@Suppress("ObjectPropertyName")
private var _SiMovie: ImageVector? = null
